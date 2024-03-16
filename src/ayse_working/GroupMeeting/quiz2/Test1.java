package ayse_working.GroupMeeting.quiz2;

class Test1<T extends Number> {


    public static void main(String[] args) {
        Test1<Integer> t1 = new Test1<Integer>();
      //  Test<String> t2 = new Test<String>();
        Test1<Double> t3 = new Test1<Double>();
        Test1<Number> t4 = new Test1<Number>();
    }
}

//class Test<T extends Number implements Runnable> { }

//class Test4<T extends Number super Runnable> { }

class Test2<T extends Number & Runnable> { }

//class Test3<T extends Number | Runnable> { }