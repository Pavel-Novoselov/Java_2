package Lesson_6.DZ;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
/**
 * Created by EVDOKIMOVAL on 04.08.2018.
 */
public class Task1 {
    public int[] doTask1(int[] arr) throws RuntimeException {
        int[] res = null;
        int i = arr.length - 1;
        int j = 0;
        boolean found = false;
        while (i >= 0 && !found) {
            found = arr[i] == 4;
            j = i;
            i--;
        }
        if(found) {
            res = new int[arr.length - j - 1];
            for (i = j + 1; i < arr.length; i++) {
                res[i - j - 1] = arr[i];
            }
        } else {
            throw new RuntimeException("Array have no 4");
        }
        return  res;
    }
}

