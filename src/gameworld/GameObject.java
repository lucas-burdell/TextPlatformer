/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameworld;

/**
 *
 * @author lucas.burdell
 */
public class GameObject {

    private Vector2 size;
    private char character;
    private Vector2 position;

    public GameObject(char character) {
        this(character, new Vector2(0, 0), new Vector2(1, 1));
    }

    public GameObject(char character, Vector2 position) {
        this(character, position, new Vector2(1, 1));
    }

    public GameObject(char character, Vector2 position, Vector2 size) {
        this.character = character;
        this.position = position;
        this.size = size;
    }

    public boolean contains(Vector2 position) {
        int x1 = this.getPosition().X;
        int y1 = this.getPosition().Y;
        int x2 = position.X;
        int y2 = position.Y;
        return !(x2 < x1 || x2 > (x1 + size.X - 1) || (y2 < y1) || (y2 > y1 + size.Y - 1));
    }

    /**
     * @param size the size to set
     */
    public void setSize(Vector2 size) {
        this.size = size;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Vector2 position) {
        this.position = position;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(char character) {
        this.character = character;
    }

    /**
     * @return the size
     */
    public Vector2 getSize() {
        return size;
    }

    /**
     * @return the character
     */
    public char getCharacter() {
        return character;
    }

    /**
     * @return the position
     */
    public Vector2 getPosition() {
        return position;
    }

}
