# LearnKotlin
Initialize the environment

简单一点儿，就是下面这些东西。

有xml问题的

java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException
这么改build

if (project.hasProperty('kapt')) {
  kapt 'javax.xml.bind:jaxb-api:2.3.1'
  kapt 'com.sun.xml.bind:jaxb-core:2.3.0.1'
  kapt 'com.sun.xml.bind:jaxb-impl:2.3.2'
}

annotationProcessor 'javax.xml.bind:jaxb-api:2.3.1'
annotationProcessor 'com.sun.xml.bind:jaxb-core:2.3.0.1'
annotationProcessor 'com.sun.xml.bind:jaxb-impl:2.3.2'
有jacoco问题的。

java.lang.ClassNotFoundException: jdk.internal.reflect.GeneratedSerializationConstructorAccessor1
这么改

testOptions {
  unitTests {
    all {
      jacoco {
        excludes = ['jdk.internal.*']
      }
   }
}

https://zhuanlan.zhihu.com/p/351164056

https://blog.csdn.net/ZuoYueLiang/article/details/119326392?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_title~default-1.no_search_link&spm=1001.2101.3001.4242.2

https://blog.csdn.net/lyabc123456/article/details/119534116?spm=1001.2101.3001.6650.2&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-2.highlightwordscore&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-2.highlightwordscore
