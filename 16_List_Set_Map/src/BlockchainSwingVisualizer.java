import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

// 블록 클래스 정의
class Block {
	private int index;
	private String previousHash;
	private long timestamp;
	private String data;
	private String hash;

	// 생성자
	public Block(int index, String previousHash, long timestamp, String data) {
		this.index = index;
		this.previousHash = previousHash;
		this.timestamp = timestamp;
		this.data = data;
		this.hash = calculateHash();
	}

	// 해시 계산 메서드
	public String calculateHash() {
		String input = index + previousHash + timestamp + data;
		return applySha256(input);
	}

	// SHA-256 해시 함수 적용
	private String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));
			StringBuilder hexString = new StringBuilder();
			for (byte b : hashBytes) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// Getter 메서드
	public int getIndex() {
		return index;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getData() {
		return data;
	}

	public String getHash() {
		return hash;
	}

	// 블록 정보 문자열로 반환
	@Override
	public String toString() {
		return "Block{" + "index=" + index + ", previousHash='" + previousHash + '\'' + ", timestamp=" + timestamp
				+ ", data='" + data + '\'' + ", hash='" + hash + '\'' + '}';
	}
}

// 블록체인 클래스 정의
class Blockchain {
	private List<Block> chain;
	private int difficulty;

	// 생성자
	public Blockchain() {
		this.chain = new ArrayList<>();
		this.difficulty = 2; // 난이도 설정 (예: 해시의 앞 4자리가 '0000'이어야 함)
		createGenesisBlock();
	}

	// 제네시스 블록 생성 메서드
	private void createGenesisBlock() {
		Block genesis = new Block(0, "0", System.currentTimeMillis(), "Genesis Block");
		genesis = mineBlock(genesis);
		chain.add(genesis);
	}

	// 블록 추가 메서드
	public void addBlock(String data) {
		Block previousBlock = chain.get(chain.size() - 1);
		Block newBlock = new Block(previousBlock.getIndex() + 1, previousBlock.getHash(), System.currentTimeMillis(),
				data);
		newBlock = mineBlock(newBlock);
		chain.add(newBlock);
	}

	// 블록 채굴 (Proof of Work)
	private Block mineBlock(Block block) {
	    int nonce = 0; // nonce 초기화
	    String target = new String(new char[difficulty]).replace('\0', '0');
	    while (!block.getHash().substring(0, difficulty).equals(target)) {
	        // nonce 값을 사용하여 블록의 내용을 변경
	        block = new Block(block.getIndex(), block.getPreviousHash(), System.currentTimeMillis(),
	                block.getData() + nonce);
	        
	        // 현재 nonce 값을 콘솔에 출력
	        System.out.println("Trying nonce: " + nonce + " for block index: " + block.getIndex());
	        
	        nonce++;
	    }
	    System.out.println("Block Mined!!! : " + block.getHash() + " after " + nonce + " attempts");
	    return block;
	}


	// 블록체인 유효성 검증 메서드
	public boolean isChainValid() {
		for (int i = 1; i < chain.size(); i++) {
			Block currentBlock = chain.get(i);
			Block previousBlock = chain.get(i - 1);
			if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
				return false;
			}
			if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
				return false;
			}
		}
		return true;
	}

	// 블록체인 전체 출력 메서드
	public void printChain() {
		for (Block block : chain) {
			System.out.println(block);
		}
	}

	// 체인 getter
	public List<Block> getChain() {
		return chain;
	}
}

// 시각화 클래스 (Swing 사용)
public class BlockchainSwingVisualizer extends JPanel {
	private List<Block> chain;

	public BlockchainSwingVisualizer(List<Block> chain) {
		this.chain = chain;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBlockchain(g, chain);
	}

	private void drawBlockchain(Graphics g, List<Block> chain) {
	    int startX = 50;  // 시작 X 좌표
	    int startY = 50;  // 시작 Y 좌표
	    int width = 150;   // 블록 너비
	    int height = 100;  // 블록 높이
	    int gap = 50;      // 블록 간의 간격

	    g.setFont(new Font("Arial", Font.PLAIN, 12)); // 폰트 크기 조정

	    for (int i = 0; i < chain.size(); i++) {
	        Block block = chain.get(i);
	        int x = startX; // X 좌표는 고정
	        int y = startY + i * (height + gap); // Y 좌표는 증가

	        // 블록 그리기
	        g.setColor(Color.LIGHT_GRAY);
	        g.fillRect(x, y, width, height);
	        g.setColor(Color.BLACK);
	        g.drawRect(x, y, width, height);

	        // 블록 정보 표시
	        g.drawString("Index: " + block.getIndex(), x + 10, y + 20);
	        g.drawString("Hash: " + block.getHash().substring(0, 10) + "...", x + 10, y + 40);
	        g.drawString("Data: " + block.getData(), x + 10, y + 60);

	        // 화살표 그리기
	        if (i < chain.size() - 1) {
	            g.drawLine(x + width / 2, y + height, x + width / 2, y + height + gap);
	            g.drawLine(x + width / 2 - 5, y + height + gap - 5, x + width / 2, y + height + gap);
	            g.drawLine(x + width / 2 + 5, y + height + gap - 5, x + width / 2, y + height + gap);
	        }
	    }
	}


	public static void main(String[] args) {
		JFrame frame = new JFrame("블록체인 시각화");
		Blockchain blockchain = new Blockchain();
		blockchain.addBlock("First block after Genesis");
		blockchain.addBlock("Second block after Genesis");
		blockchain.addBlock("Third block after Genesis");

		BlockchainSwingVisualizer panel = new BlockchainSwingVisualizer(blockchain.getChain());
		frame.add(panel);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
