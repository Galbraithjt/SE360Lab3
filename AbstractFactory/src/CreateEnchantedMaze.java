/**
 * Created by Joshua on 10/9/2016.
 */
public class CreateEnchantedMaze extends CreateMaze
{
    protected Maze makeMaze(String typeOfMaze)
    {
        Maze theMaze = null;

        if(typeOfMaze.equals("Enchanted"))
        {
            MazeFactory mazePartsFactory = new EnchantedMazeFactory();
            theMaze = new EnchantedMaze(mazePartsFactory);
            theMaze.setName("Enchanted");
        }
        else if(typeOfMaze.equals("Bombed"))
        {
            MazeFactory mazePartsFactory = new BombedMazeFactory();
            theMaze = new BombedMaze(mazePartsFactory);
            theMaze.setName("Bombed");
        }
        return theMaze;
    }

}

