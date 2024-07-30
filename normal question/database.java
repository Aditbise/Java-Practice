import java.util.*;

class staff {
    Scanner sc = new Scanner(System.in);

    String code() {
        System.out.println("Enter your code:");
        String s = sc.nextLine();
        return s;
    }

    String name() {
        System.out.println("Enter your name:");
        String n = sc.nextLine();
        return n;
    }
}

class teacher extends staff {
    String subject() {
        System.out.println("Enter subject name:");
        String s = sc.nextLine();
        return s;
    }

    String publications() {
        System.out.println("Enter the publications name:");
        String p = sc.nextLine();
        return p;
    }
}

class officer extends staff {
    String grade() {
        System.out.println("Enter the grade of officer:");
        String g = sc.nextLine();
        return g;
    }
}

class typist extends staff {
    int speed() {
        System.out.println("Enter the speed of typist:");
        int s = sc.nextInt();
        return s;
    }
}

class regular extends typist {
    int salary() {
        super.speed();
        System.out.println("Enter the salary:");
        int s = sc.nextInt();
        return s;
    }
}

class casual extends typist {
    int daily_wages() {
        System.out.println("Enter the daily wages:");
        int dw = sc.nextInt();
        return dw;
    }
}

public class database {
    public static void main(String args[]) {
        casual c = new casual();
        System.out.println("Daily Wage:"+c.daily_wages()+"\ntyping speed:"+c.speed());
    }
}
