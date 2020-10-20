package com.example.demo.study.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author sya
 * @Description
 * @date 2020-10-13 11:28
 */
public class MyClassLoaderTest  {
    private static class MyClassLoader extends ClassLoader{
       private String classPath;

        public MyClassLoader( String classPath) {
            this.classPath = classPath;
        }

        /**
         * 重写findClass方法
         * @param name 是我们这个类的全路径
         * @return
         * @throws ClassNotFoundException
         */
        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            Class log = null;
            // 获取该class文件字节码数组
            byte[] classData = getData();

            if (classData != null) {
                // 将class的字节码数组转换成Class类的实例
                log = defineClass(name, classData, 0, classData.length);
            }
            return log;
        }

        /**
         * 将class文件转化为字节码数组
         * @return
         */
        private byte[] getData() {

            File file = new File(classPath);
            if (file.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(file);
                    out = new ByteArrayOutputStream();

                    byte[] buffer = new byte[1024];
                    int size = 0;
                    while ((size = in.read(buffer)) != -1) {
                        out.write(buffer, 0, size);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        in.close();
                    } catch (IOException e) {

                        e.printStackTrace();
                    }
                }
                return out.toByteArray();
            }else{
                return null;
            }


        }

    }

    public static void main(String[] args) throws Exception{
        MyClassLoader myClassLoader = new MyClassLoader("C:\\studyProjects");
        Class<?> clazz = myClassLoader.loadClass("com.example.demo.study.classloader.MyClassLoaderTest");
        Object o = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("test", null);
        method.invoke(o,null);
        System.out.println(clazz.getClassLoader().getClass().getName());





    }

    public static void test(){
        System.out.println("1q11111111");

    }



}
