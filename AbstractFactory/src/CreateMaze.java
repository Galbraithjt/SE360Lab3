/**
 * Created by Joshua on 10/9/2016.
 */
public abstract class CreateMaze {
    protected abstract Maze makeMaze(String typeOfShip);

    public Maze orderTheMaze(String typeOfMaze)
    {
        Maze theMaze = makeMaze(typeOfMaze);
        theMaze.makeMaze();

        return theMaze;

    }
}
