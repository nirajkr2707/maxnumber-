public class STRques {
    
    public static float getshortestpath(String path){
        int x=0,y=0;
        
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            if(dir == 'N'){
                y++;
            }
            //west
            if(dir == 'W'){
                x--;
            }
            //East
            if(dir == 'E'){
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        
        return (float)Math.sqrt(x2,y2);

    }

    public static void main(String args[]) {
        String path ="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
}
