# Chapter 26. 파일에 있는 것을 읽고 쓰려면 아이오를 알아야죠
## 직접해봅시다.
- 


## 정리해봅시다
### 1. I/O는 각각 무엇의 약자인가요?
- Input/Output

### 2. java.io.File 클래스는 파일만 지정할 수 있나요?
- X

### 3. OS 마다 다른 경로 구분자를 처리하기 위해서는 File 클래스의 어떤 상수를 사용해야 하나요?
- separator

### 4. File 클래스에서 디렉터리를 만드는 mkdir()과 mkdirs() 메소드의 차이는 무엇인가요?
- mkdir 메소드는 디렉터리를 하나만 만들고 mkdirs 메소드는 여러개의 하위 디렉터리를 만든다

### 5. File 클래스의 list() 메소드와 listFiles() 메소드의 차이는 무엇인가요?
- list() 메소드의 경우 리턴값이 String 배열이며 listFiles()메소드의 경우는 리턴값이 File의 배열이다

### 6. FileFilter와 FilenameFilter의 차이는 무엇인가요?
- FileFilter매개 변수로 넘어온 File객체가 조건에 맞는지 확인, FilenameFilter는 매개 변수로 넘어온 디렉터리에 있는 경로나 파일 이름이 조건에 맞는지 확인

### 7. InputStream 이라는 abstract 클래스는 어떤 작업을 하기 위해서 만들어 진 것인가요?
- 스트림에서 바이트를 읽을 때

### 8. OutputStream 이라는 abstract 클래스는 어떤 작업을 하기 위해서 만들어 진 것인가요?
- 스트림에서 바이트를 쓸 때

### 9. Reader 라는 abstract 클래스는 어떤 작업을 하기 위해서 만들어 진 것인가요?
- char 기반의 문자열을 읽기 위한 클래스

### 10. Writer 라는 abstract 클래스는 어떤 작업을 하기 위해서 만들어 진 것인가요?
- char 기반의 문자열을 쓰기 위한 클래스

### 11. BufferedReader나 BufferedWriter를 사용하는 이유는 무엇인가요?
- 버퍼라는 공간을 사용해서 효율적으로 저장히기 위해

### 12. 파일을 읽고, 문자열을 처리하기 위해서 필요한 Scanner 클래스가 속해있는 패키지는 무엇인가요?
- java.util


## (답안) 정리해봅시다
1. I/O는 Input과 Output을 의미한다.

2. java.io 패키지의 File 클래스는 파일과 경로(path)를 나타낼 수 있다.

3. File 클래스에 선언되어 있는 separator 상수는 현재 JVM이 사용중인 OS의 경로 구분자를 의미한다.

4. mkdir() 메소드는 현재 존재하는 경로의 하위 폴더만 생성 가능하며, mkdirs() 메소드는 지정된 경로에 존재하지 않는 모든 폴더를 생성한다.

5. 두 메소드 모두 현재 디렉터리의 하위에 있는 목록을 나타내는데, list() 메소드는 String[] 타입으로, listFiles() 메소드는 File[] 타입으로 리턴한다.

6. 두 Filter 인터페이스는 모두 넘어온 File과 관련된 정보를 이용하여 파일을 필터링할 목적으로 사용된다.
FileFilter 인터페이스에는 accept(File pathName)으로 선언되어 있는 메소드가 있고, FilenameFilter 인터페이스에는 accept(File dir, String name) 으로 선언되어 있는 메소드가 있다는 점이 다르다. 
따라서, FilenameFilter는 가장 하위에 있는 대상의 이름만 넘어오기 때문에, 가장 하위에 있는 것이 파일인지 경로인지를 구분할 수가 없다.

7. InputStream 클래스는 입력된 byte 데이터를 다루기 위해서 만들어 졌다. 

8. OutputStream 클래스는 byte 데이터를 출력하기 위해서 만들어 졌다.

9. Reader 클래스는 입력된 텍스트 데이터(char 기반의 문자열)를 다루기 위해서 만들어 졌다.

10. Writer 클래스는 텍스트 데이터(char 기반의 문자열)를 출력하기 위해서 만들어 졌다.

11. java.io 패키지의 Buffered가 붙은 클래스들은 버퍼라는 공간에 저장할 데이터를 보관해 두었다가, 버퍼가 차게되면 데이터를 저장하도록 도와준다. 따라서, 매우 효율적인 저장이 가능하다. 

12. Scanner 클래스는 java.util 패키지에 선언되어 있다. 