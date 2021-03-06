package p4_group_8_repo;

public class ObstacleFactory extends AbstractFactory{
    private double speed = 0;

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    /**
     * <h1>Obstacle Factory</h1>
     * <p>Creates an object of any of the obstacles</p>
     * @param obstacleName Which obstacle it will be linked to
     * @param imageLink Image of that obstacle
     * @param size size of obstacle
     * @param xPos Starting X-Position
     * @param yPos Starting Y-Position
     * @return Obstacle Type
     */
    @Override
    public Actor getActor(String obstacleName, String imageLink, double size, double xPos, double yPos) {
        Actor obstacleType = null;

        if(obstacleName.equalsIgnoreCase("Log")){
            obstacleType = new Log(imageLink, size, xPos, yPos, speed);
        }
        else if(obstacleName.equalsIgnoreCase("Car")){
            obstacleType = new Car(imageLink, size, xPos, yPos, speed);
        }
        else if(obstacleName.equalsIgnoreCase("Turtle")){
            obstacleType = new Turtle(imageLink, size, xPos, yPos, speed);
        }
        else if(obstacleName.equalsIgnoreCase("WetTurtle")){
            obstacleType = new WetTurtle(imageLink, size, xPos, yPos, speed);
        }
        return obstacleType;
    }
}
