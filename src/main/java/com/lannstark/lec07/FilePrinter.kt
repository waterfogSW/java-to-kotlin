package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

// 코틀린에서는 checked exception 을 모두 unchecked exception으로 간주한다
// try with resources는 코틀린의 특성을 이용한 특수한 함수(ex. use)로 대체할 수 있다.
class FilePrinter {
    fun readFile(path: String) =
        BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
}
