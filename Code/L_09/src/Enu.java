public class App {
    public static void main(String[] args) {

        Level level = Level.MEDIUM;
        System.out.println(level.getLevelCode());
        level.levelCode = 2;
        level.f();

        if (level == Level.HIGH) {
            System.out.println("");
        } else {
            System.out.println(level);
        }


    }
}

enum Level {
    HIGH(3){
        @Override
        String f(){
            return "s";
        }
    },
    MEDIUM(3){
        @Override
        String f(){
            return "m";
        }
    },
    LOW(1){
        @Override
        String f(){
            return "a";
        }
    };

    int levelCode;

    Level(int levelCode){
        this.levelCode = levelCode;
    }

    int getLevelCode(){
        return levelCode;
    }

    abstract String f();

}
