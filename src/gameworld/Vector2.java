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
public class Vector2 {
    
    public final int X;
    public final int Y;
    
    public Vector2(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    
    public Vector2 add(Vector2 other) {
        return new Vector2(X + other.X, Y + other.Y);
    }
    
    public Vector2 sub(Vector2 other) {
        return new Vector2(X - other.X, Y - other.Y);
    }
    
    public Vector2 mul(Vector2 other) {
        return new Vector2(X * other.X, Y * other.Y);
    }
    
    public int dot(Vector2 other) {
        return X * other.X + Y * other.Y;
    }
    
    
}
