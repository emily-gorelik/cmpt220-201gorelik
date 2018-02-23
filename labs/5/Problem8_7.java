
public class Problem8_7 {
    //tester method
    public static void main(String[] args) {
        //2D double array with values for test points
        double[][] points = new double[][] {{-1, 0 ,3}, {-1, -1, -1}, 
                                            {4, 1, 1},{2, 0.5, 9}, 
                                            {3.5, 2, -1}, {3, 1.5, 3},
                                            {-1.5, 4, 2}, {5.5, 4, -0.5}};
                                            
        //placeholders for the two closest points
        int p1 = 0;
        int p2 = 1;
        
        //double that stores the shortest distance between two points
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], 
            points[p2][1], points[p2][2]);
         
        //finds out which points have the shortest distance    
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                //calculates distance between every point and stores it in a variable
                double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0],
                    points[j][1], points[j][2]);
                
                //if a distance is found to be shorter than shortestDistance, values are replaced to display the true shortest distances
                if(shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        
        //prints out results
        System.out.println("The two points closest to each other are " + "(" + points[p1][0] + ", " 
            + points[p1][1] + ", " + points[p1][2] +") and (" + points[p2][0] + ", " + points[p2][1] + 
            ", " + points[p2][2] + ")");
    }
    
    //calculates distance between two points in a 3D space
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
    }
}
