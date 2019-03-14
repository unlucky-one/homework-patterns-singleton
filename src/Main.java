import com.reiden.homework.patterns.singleton.DoubleCheckSingleton;
import com.reiden.homework.patterns.singleton.EnumSingleton;
import com.reiden.homework.patterns.singleton.HungrySingleton;
import com.reiden.homework.patterns.singleton.InnerClassSingleton;

public class Main {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        EnumSingleton instance3 = EnumSingleton.getInstance();

    }
}
