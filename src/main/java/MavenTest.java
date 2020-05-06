import org.codehaus.plexus.classworlds.launcher.Launcher;

public class MavenTest {

    public static void main(String[] args) {

        //VMOPTION: -Dclassworlds.conf=C:\\cs\\maven\\apache-maven-3.6.3\\bin\\m2.conf -Dmaven.home=C:\\cs\\maven\\apache-maven-3.6.3 -Dlibrary.jansi.path=C:\\cs\\maven\\apache-maven-3.6.3\\lib\\jansi-native -Dmaven.multiModuleProjectDirectory=C:\\cs\\JavaSpace\\Test
        //-Dmaven.multiModuleProjectDirectory=C:\\cs\\JavaSpace\\Test 这个参数好像没啥用 但是放上去也没影响
        String[] arg2 = {"dependency:tree"};
        Launcher.main(arg2);
    }

}
