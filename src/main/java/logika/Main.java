package logika;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 digit - size of matrix ");
            String str = sc.nextLine();
            String[] s = str.split(" ", 2);
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int[][] arr2 = new int[a][b];

            int r;//row
            int c;//column
            for(r = 0; r < a; ++r) {
                for(c = 0; c < b; ++c) {
                    arr2[r][c] = 0;
                }
            }

            r = 0;
            c = 0;
            int nc = b;//number of columns to change
            int nr = a;//number of row to change

            //основной цикл заполнения массива - вызов 4 методов - по строке вправо, по столбцу вниз, по строке влево и по столбцу вверх
            for( int i = 0; i < ((a+b)/4+1); ++i) {
                System.out.println(r+" "+c+" "+nr+" "+nc);
                arr2 = mrr(arr2, r, c, nc);
                ++r;
                --nr;
                c = c + nc - 1;
                if (r<0||c<0||nc<0||nr<0) break;

                System.out.println(r+" "+c+" "+nr+" "+nc);
                arr2 = mcd(arr2, r, c, nr);
                --c;
                --nc;
                r = r + nr - 1;
                if (r<0||c<0||nc<0||nr<0) break;

                System.out.println(r+" "+c+" "+nr+" "+nc);
                arr2 = mrl(arr2, r, c, nc);
                --r;
                --nr;
                c = c - nc + 1;
                if (r<0||c<0||nc<0||nr<0) break;

                System.out.println(r+" "+c+" "+nr+" "+nc);
                arr2 = mcu(arr2, r, c, nr);
                ++c;
                --nc;
                r = r - nr + 1;
                if (r<0||c<0||nc<0||nr<0) break;

                System.out.println();

            }

            System.out.println();
            for(int i = 0; i < a; ++i) {
                for(int j = 0; j < b; ++j) {
                    System.out.print(arr2[i][j] + " ");
                    if (arr2[i][j] < 10) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        static int[][] mrr(int[][] arr, int r, int c, int n) {
            for(int i = c; i < c + n; ++i) {
                if (arr[r][i] == 0) {
                    try {
                        arr[r][i] = arr[r][i - 1] + 1;
                    } catch (ArrayIndexOutOfBoundsException var6) {
                        arr[r][i] = 1;
                    }
                }
            }
            return arr;
        }

        static int[][] mrl(int[][] arr, int r, int c, int n) {
            for(int i = c; i > c - n; --i) {
                if (arr[r][i] == 0) {
                    arr[r][i] = arr[r][i + 1] + 1;
                }
            }
            return arr;
        }

        static int[][] mcd(int[][] arr, int r, int c, int n) {
            for(int i = r; i < r + n; ++i) {
                if (arr[i][c] == 0) {
                    try {
                        arr[i][c] = arr[i - 1][c] + 1;
                    } catch (Exception var6) {
                        arr[i][c] = arr[i].length;
                    }
                }
            }

            return arr;
        }

        static int[][] mcu(int[][] arr, int r, int c, int n) {
            for(int i = r; i > r - n; --i) {
                if (arr[i][c] == 0) {
                    arr[i][c] = arr[i + 1][c] + 1;
                }
            }
            return arr;
        }
    }
