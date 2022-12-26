package com.lannstark.lec11

//유틸리티성 클래스를 만들 경우 단순히 함수만 정의한 파일을 설정하면 자동으로
//파일명 + Kt 유틸리티 클래스를 만들어 준다.
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
