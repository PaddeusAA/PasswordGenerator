import java.util.Random;

public class PasswordGenerator {
    public String generatePassword(int length) {
        // ��������� ������� �������� ������������ ������� ���������� ������
        String characters = "QE%kN@Bvu)!tAKcO6M5x#GU$Dz4aWYqFogXPrjdTIle12p983y07mhw*S(ZJHfRV&iC^nLsb";

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));


        }
        return password.toString();
    }
}
