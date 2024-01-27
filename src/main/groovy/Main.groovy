static void main(String[] args) {
    println "Hello world!"

    // 范围,即range
    def range = 5..10
    def get = range.get(1)
    println "range: " + range
    println "get: " + get

    // 赋值
    int a = 5
    def b = 4
    def x = a % b
    println(x)

    // 循环
    for (int s : range) {
        println("循环输出：" + s)
    }

    for (int s in range) {
        println("循环输出第二种方法：" + s)
    }

    // 键值对
    def employee = ["key": 1, "name": "tom"]
    println(employee)
    for (i in employee) {
        println(i)
    }

    // 定义方法
    println(testMethod(1, 2))

    // 对象的使用
    def user = new User()
    // 对象赋值1
    user.name = "jim"
    user.age = 10
    println(user.getProperty("name"))
    // 对象赋值2
    user.with {
        name = "tom"
        age = 30
    }
    println(user.name)

    // 对象赋值2
    def user2 = new User(name:"jack",age:40)
    println(user2.age)

    // equals == is
    def num1 ,num2
    // ==等价java equals
    if (num1 ==num2){
        println "相等"
    } else {
        println "不等"
    }

    if (num1.equals(num2)){
        println "相等"
    } else {
        println "不等"
    }

    // 等价java==
    if (num1.is(num2)){
        println "相等"
    } else {
        println "不等"
    }

    def c = 1
    println c++
    println c

    // <<的使用，类似add方法添加元素到集合中方式一：add方法
    def list = [1,2,3]
    list.add(11)
    println list.size()
    // 方式二 ： <<
    def list2 = [1,2,3,5]
    println(list2.size())
    list2 << 6;
    println list2.size()
}

class User {
    int age;
    String name;
}

static def testMethod(int a, int b) {
    return a + b
}
