package java_study_0107;

import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
    private int x, y;
    private final int WIDTH = 60;
    private final int HEIGHT = 60;
    private Image playerImage;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        loadImage();
    }
    
    private void loadImage() {
        try {
            playerImage = ImageIO.read(getClass().getResource("/images/player.gif"));
            // 이미지 파일은 프로젝트의 resources/images 폴더에 저장해야 합니다
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void moveLeft() {
        if (x > 0) x -= 10;
    }
    
    public void moveRight() {
        if (x < 460) x += 10;
    }
    
    public void draw(Graphics g) {
        if (playerImage != null) {
            g.drawImage(playerImage, x, y, WIDTH, HEIGHT, null);
        } else {
            // 이미지 로드 실패시 기본 도형으로 표시
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, WIDTH, HEIGHT);
        }
    }
    
    public boolean intersects(Circle mushroom) {
        Rectangle playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle mushroomBounds = new Rectangle(
            mushroom.getX(), mushroom.getY(), 
            mushroom.getWidth(), mushroom.getHeight()
        );
        return playerBounds.intersects(mushroomBounds);
    }
}