import com.lambton.LambtonStringTools;

public class mainfile
{
    public static void main (String[] args) {
        LambtonStringTools t1 = new LambtonStringTools();
        System.out.println(t1.reverse("lambton"));
        System.out.println(t1.binaryToDecimal("10100011101101"));
        t1.initials("happy DAndiwal siINGh");
        System.out.println(t1.replaceSubString("the lambton toronto","the","that"));


    }
}
