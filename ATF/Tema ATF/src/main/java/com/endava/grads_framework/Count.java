package com.endava.grads_framework;

public class Count {

        static int count = 0;
        public Count() {
            count++;
        }
        public static int instancesNo() {
            return count;
        }

}
