package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String students[] = {"son", "nguyen", "tai", "viet", "cuong", "nam"};
        System.out.println("nhap ten sinh vien muon tim kiem: ");
        boolean isExist = false;
        Scanner sc = new Scanner(System.in);
        String tenSv = sc.nextLine();

        for(int i=0; i<students.length; i++){
            if (students[i].equals(tenSv)){
                System.out.println("Vi tri cua sinh vien trong mang la: " + (i+1));
                isExist = true;
                break;
            }

        }
        if (!isExist){
            System.out.println("ten ko ton tai trong mang");
        }

    }
}
