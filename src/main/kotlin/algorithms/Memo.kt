package algorithms

import kotlin.system.measureTimeMillis

// 문자열 ────────────────────────────────────────────────────────
// 팰린드롬 -> 투 포인터
//



// 입력 ────────────────────────────────────────────────────────
// 종료조건 없는 입력 -> Scanner 이용, while(s.hasNextLine()) {}
// 입력이 많으면 BufferedReader 사용

// 계산 ────────────────────────────────────────────────────────
// Int 범위 초과 확인 필요

// 정렬 ────────────────────────────────────────────────────────
// list.sortBy { it.length }
// list.sortWith {}

// 최대 최소 ────────────────────────────────────────────────────────

// 10818번
// 리스트 sort()로 구현 -> 2084ms
// 스캐너를 이용한 min, max 찾기로 구현 -> 1464ms
// 버퍼리더를 이용한 min, max 찾기로 구현 -> 648ms
fun main() {
 val string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam accumsan tristique mollis. Maecenas eu purus lectus. Duis ornare, lectus finibus sagittis porta, tellus velit posuere justo, cursus sodales diam turpis vitae diam. Donec mauris leo, pellentesque a cursus quis, consequat eu ex. Integer neque dolor, eleifend et ligula in, mattis egestas ipsum. Donec non diam maximus, iaculis sapien et, euismod dui. Ut dignissim lorem sed purus ultricies pretium. Nulla facilisi. Nullam fringilla hendrerit sem, nec molestie urna ultricies eget.\n" +
         "\n" +
         "Maecenas varius consequat fermentum. Vivamus cursus nec odio at rhoncus. Etiam vulputate augue a elementum egestas. Sed porta augue metus, ut rhoncus purus ultrices a. Sed eu aliquet nibh. Donec placerat ultrices dictum. Aliquam consectetur turpis et convallis elementum. Donec et pellentesque magna. Donec id fermentum dolor. Sed mattis libero nec interdum interdum. Proin varius feugiat urna vitae porttitor. Donec ut sollicitudin sapien. Vivamus feugiat rutrum elit, eget dignissim justo malesuada at. Donec dui mauris, condimentum ut quam sit amet, iaculis commodo lectus. Ut risus ante, volutpat et justo nec, pretium gravida est. Praesent fermentum eu magna quis posuere.\n" +
         "\n" +
         "Nulla eu rutrum nisl. Fusce volutpat, quam a dapibus semper, eros lectus egestas turpis, id ultricies orci elit eu ex. Cras vel ex porta leo efficitur iaculis. Nulla faucibus consectetur est, non scelerisque mauris aliquam ac. Donec sit amet ex id massa blandit tempor et in nunc. Donec malesuada risus magna, ultricies aliquet dui tempor ut. Pellentesque lacinia, velit non vehicula tempus, ipsum sapien efficitur risus, in ultrices lectus ipsum sed lacus. Nullam varius non nisi accumsan dictum. Aenean bibendum sagittis tortor quis commodo. In sem enim, cursus eu dui quis, eleifend viverra sem. Vivamus dignissim non lacus ut egestas.\n" +
         "\n" +
         "Phasellus at neque sed arcu tincidunt semper nec sed mi. Integer ligula erat, vestibulum a fermentum sit amet, varius in turpis. Pellentesque sed turpis lorem. Proin sagittis, nunc ut molestie placerat, lectus magna posuere orci, a ultrices tortor turpis at nibh. Pellentesque nec erat libero. Mauris consectetur venenatis accumsan. Sed pharetra nisi et purus sodales ultrices. Sed facilisis nunc et hendrerit finibus.\n" +
         "\n" +
         "Curabitur lacinia metus sit amet libero finibus, a pretium urna dapibus. Etiam posuere iaculis nulla, a faucibus elit rhoncus nec. Quisque quis eleifend nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vel imperdiet mi, sed viverra erat. Nullam urna libero, vestibulum non lacinia non, elementum id nibh. Aliquam erat volutpat. Mauris semper turpis non tortor sollicitudin, id placerat risus consequat. Proin ut tellus pharetra enim fermentum sollicitudin nec vitae tellus. Phasellus consequat est non ligula vehicula egestas. Sed laoreet tincidunt dui, ac faucibus purus blandit at. Nulla congue eu magna sit amet efficitur."

 println(measureTimeMillis {
  StringBuilder(string).reverse().toString()
 })

 println(measureTimeMillis {
  string.toCharArray()
  string.reversed()
 })

// println(measureTimeMillis {
//  string.reversed()
// })

 println("31e".toFloatOrNull())
 println("3.14".toFloatOrNull())
 println("314".toFloatOrNull())
 println("31".toIntOrNull())
 println("-31".toIntOrNull())
 println("3.14".toIntOrNull())
}
