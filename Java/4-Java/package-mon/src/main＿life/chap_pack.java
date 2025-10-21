package main＿life;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import class＿life.Store;

public class chap_pack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("店舗数を入力してください: ");
        int count = sc.nextInt();
        sc.nextLine(); // 改行消費

        List<Store> storeList = new ArrayList<>();

        // 店舗データ入力
        for (int i = 0; i < count; i++) {
            System.out.println("\n=== " + (i + 1) + "店舗目の情報を入力 ===");

            System.out.print("店番 (100〜300): ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("店名 (例: 渋谷, 新宿など): ");
            String name = sc.nextLine();

            System.out.print("売上額: ");
            double sales = sc.nextDouble();

            System.out.print("目標額: ");
            double target = sc.nextDouble();

            Store store = new Store(number, name, sales, target);
            storeList.add(store);
        }

        System.out.println("\n=== 各店舗の達成率と評価 ===");
        for (Store store : storeList) {
            store.calculateAchievementRate();
            store.evaluateAchievement();
            System.out.println();
        }

        System.out.println("=== 全店舗の情報 ===");
        for (Store store : storeList) {
            store.displayAll();
        }

        sc.close();
    }
}
