/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameworld;

import java.util.ArrayList;

/**
 *
 * @author lucas.burdell
 */
public class World {

    public static final int WIDTH = 50;
    public static final int HEIGHT = 10;
    

    private final Vector2 size = new Vector2(WIDTH, HEIGHT);
    private final ArrayList<GameObject> objects = new ArrayList<>();
    private final GameObject character; 
    
    private GameObject makePlatform(Vector2 position) {
        GameObject object = new GameObject('#', position, new Vector2(1, 1));
        objects.add(object);
        return object;
    }

    private GameObject makeCharacter(Vector2 position) {
        GameObject object = new GameObject('X', position, new Vector2(1, 1));
        objects.add(object);
        return object;
    }

    public World() {
        for (int i = 0; i < WIDTH; i++) {
            GameObject platform = makePlatform(new Vector2(i, HEIGHT - 1));
        }
        character = makeCharacter(new Vector2(0, HEIGHT - 2));
    }
    
    public char charAt(Vector2 pos) {
        for (GameObject object : objects) {
            if (object.contains(pos)) {
                return object.getCharacter();
            }
        }
        return ' ';
    }
    
    public String render() {
        StringBuilder map = new StringBuilder();
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                map.append(charAt(new Vector2(x, y)));
            }
            map.append('\n');
        }
        return map.toString();
    }

}
