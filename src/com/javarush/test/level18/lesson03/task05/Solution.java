package com.javarush.test.level18.lesson03.task05;

import java.io.*;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path = br.readLine();
        File file = new File(path);
        Set<Integer> set = new TreeSet<>();

        InputStream is = new FileInputStream(file);

        int oneByte;

        while ((oneByte = is.read()) != -1){

            set.add(oneByte);

        }

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }

        is.close();
    }
}