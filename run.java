import java.io.*;

class run
{
        public static void main(String[] args) throws IOException
        {
                System.out.println("1kmkmを走る分数(minutes)入力しEnterを押して下さい、その後秒数(seconds)を入力しEnterを押してして下さい。");

                BufferedReader br =
                         new BufferedReader(new InputStreamReader(System.in));

                String Minutes;
                         Minutes = br.readLine();

                String Seconds;
                         Seconds = br.readLine();


                int num1 =Integer.parseInt(Minutes);
                int num2 =Integer.parseInt(Seconds);

                double runtimeStotal = (((int)num1 * 60.0 + (int)num2)*42.195);
                int runtimeM = ((int)runtimeStotal / 60);
                int runtimeS = ((int)runtimeStotal % 60);
                int runtimeH = ((int)runtimeM / 60);
                int runtimeMH = ((int)runtimeM % 60);

                System.out.print("あなたがフルマラソンを走り切るタイムは");
                System.out.print(runtimeH);
                System.out.print("時間");
                System.out.print(runtimeMH);
                System.out.print("分");
                System.out.print(runtimeS);
                System.out.print("秒");
                System.out.print("です。");


        }
}
~    
