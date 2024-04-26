package lab6.ex5;

import java.util.Scanner;

public class BettaUser extends AlphaUser{
    public String fname;

    @Override
    public void setParametr(Scanner scanner) {
        this.fname = scanner.next();
    }
}
