package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//fun main() {
//    val text  = "lat"
//    for (char in text ){
//        print("$char")
//    }
//}
//output : lat
//fun main(){
//    val name = "unicode test: \u00A9"
//    print(name)
//}

// output : unicode test: ©

//fun main() {
//    val line = """
//        Line 1
//        Line 2
//        Line 3
//        Line 4
//    """.trimIndent()
//
//    print(line)
//}

/*
    output:
    Line 1
    Line 2
    Line 3
    Line 4
 */
// fun main(){
//     val name = "kotlin"
//    print("my name is "+ name)
//
// }
/*
        output : My name is Kotlin
    */

//fun main(){
//    val name = "kotlin"
//    val old = 3
//    print("My name is $name, im $old years old")
//}
/*
        output : My name is Kotlin, im 3 years old
    */

//fun main(){
//    val hour = 7
//    print("Office ${if (hour > 7)"already close" else "is open"}")
//}
/*
        output : Office is open
    */

//fun main(){
//    val openHours = 7
//    val now = 20
//    val office: String
//    if (now > openHours){
//        office ="office already open"
//    } else {
//        office = "office is closed"
//    }
//    print(office)
//}

//fun main(){
//    val openHours = 7
//    val now = 20
//    val office: String
//    office = if (now > openHours){
//       "office already open"
//    } else {
//         "office is closed"
//    }
//    print(office)
//}

//fun main(){
//    val openHours = 7
//    val now = 20
//    val office: String
//    office = if (now > 7){
//        "office already open"
//    }else if (now == openHours){
//        "wait a minute, office will be open"
//    } else {
//        "office is closed"
//    }
//    print(office)
//}


//fun main(){
//    val officeOpen = 7
//    val officeClosed = 16
//    val now = 20
//
//    val isOpen = if (now >= officeOpen && now <= officeClosed){
//        true
//    } else {
//        false
//    }
//
//    print("Office  is open $isOpen")
//}
//val isClose = now < officeOpen || now > officeClosed
//
//print("Office is closed : $isClose")
///*
//        Output : Office is closed : true
//     */

//fun main(){
//    val maxInt = Int.MAX_VALUE
//    val minInt = Int.MIN_VALUE
//
//    println(maxInt)
//    println(minInt)
//}
/*
     output :
            2147483647
           -2147483648
     */


//fun main(){
//    val intArray = intArrayOf(1,3,5,7) // [1,3,5,7]
//    intArray[2] = 11                    // [1,3,11,7]
//
//    print(intArray[2])
//}

//fun main(){
//    var string: String? = "Dicoding"
//    if(string != null) {
//        print(string.length)
//    }
//}

//fun main(){
//    val fullName = getFullName(first = "kotlin", middle = " is ", last = "awesome")
//    print(fullName)
//}
//fun getFullName(first: String, middle: String, last: String) : String {
//    return " $first $middle $last"
//}

//fun getFullName(
//    first: String = "felix",
//    middle: String = "Octaniel",
//    last: String = "Awesome"): String {
//    return "$first $middle $last"
//
//}
//)

//fun getFullAddress(streetName: String, number: Int): String {
//    return "I live in $streetName No. $number"
//}

