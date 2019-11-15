package practice;
import java.util.*;

public class Maze {
	private static int N = 8;
	private static int [][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	public static final int pathway = 0;
	public static final int wall = 1;
	public static final int blocked = 2;
	public static final int path = 3;
	public static void printMaze() {
		for(int i=0; i<maze.length;i++) {
			for(int j=0; j<maze.length;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean findMazePath(int x , int y) {
		if(x<0 || y<0 || x>=N || y>=N) return false;
		else if(maze[x][y] != pathway) return false;
		else if(x==N-1 && y==N-1) {
			maze[x][y] = path;
			return true;
		}
		maze[x][y] = path;
		if(findMazePath(x,y+1) || findMazePath(x+1,y) ||
				findMazePath(x,y-1) || findMazePath(x-1,y)) {
			return true;
		}
		maze[x][y] = blocked;
		return false;
	}
	
	public static void main(String[] args) {
		printMaze();
		System.out.println();
		findMazePath(0,0);
		printMaze();
	}
}
