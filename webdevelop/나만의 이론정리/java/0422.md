# 0422 webdevelop - Java(스트림, GUI

## 스트림

### 중간연산

- 연산 결과가 스트림인 연산
- 메서드
    - `Stream<T> distinct()`  : 중복을 제거
    - `Stream<T> filert(Predicate<T> predicate)` : 조건에 안맞는 요소 제외
    - `Stream<T> limit(long maxSize)` : 스트림의 일부를 잘라낸다.
    - `Stream<T> skip(long n)` : 스트림의 일부를 건너뛴다
    - `Stream<T> peek(Consumer<T> action)` : 스트림의 요소에 작업을 수행
    - `Stream<T> sorted()` : 요소를 정렬
    - `Stream<T> sorted(Comparato<T> comparator)` : 요소를 정렬

### 최종 연산

- 연산결과가 스트림이 아닌 연산.
- 스트림의 요소를 소모하므로 단 한번만 가능
- 메서드
    - `void forEach(Consumer<? super T> action)` : 반복
    - `long count()` : 스트림의 요소의 갯수를 반환
    - `Optional<T> max(Comparator<? super T> comparator)` : 스트림의 최댓값 반환
    - `Optional<T> mon(Comparator<? super T> comparator)` : 스트림의 최솟값 반환
    - `Optional<T> findAny()` : 아무거나 하나 반환
    - `Optional<T> findFirst()` : 첫번째 요소 반환
    - `boolean allMatch(Predicate<T> p)` : 모든 요소가 조건을 만족하는지
    - `boolean AnyMatch(Predicate<T> p)` : 요소중 하나라도 조건을 만족하는지
    - `boolean noneMatch(Predicate<T> p)` : 모두 만족을 안하는지
    - `Object[] toArray()` : 스트림의 모든 요소를 배열로 반환
    - `A[] toArray(IntFunction<A[]> generator)` : 스트림의 모든 요소를 배열로 반환
        
        ```java
        String[] list2_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
        ```
        
    - `Optional<T> reduce(BinaryOperator<T> accmulator)` : 스트림의 요소를 하나씩 거쳐가면서 계산을 해준다.
    - `T reduce(T identity, BinaryOperator<T> accmulator)` : 스트림의 요소를 하나씩 거쳐가면서 계산을 해준다.
        
        ```java
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 기본자료형으로 바꿔워야해서 오토 언박싱 발생
        int total = Arrays.stream(nums).reduce(0, (x,y) -> x + y );
        																	      // 0 1  -> 0 + 1
        																	      // 1 2  -> 1 + 2
        																	      // 3 3  -> 3 + 3
        																	      // 6 4  -> 6 + 4
        ```
        
        - 오토언박싱이 이루어지지 않는
        
        ```java
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream stream2 = Arrays.stream(nums2);
        int total2 = stream2.reduce(0, (x,y) -> x + y );
        System.out.println("1 ~ 10까지의 총합 : " + total2);
        ```
        
    - `R collect(Collector<T,A,B> collector)` : 스트림의 요소를 수집, 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환
        
        ```java
        // Collectors : stream을 일반적인 List, Set등의 컬렉션으로 변경시키는 클래스
        // toCollection() : 좀 더 특정한 컬렉션으로 구현
        ArrayList<String> list1_1 = list1.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        ```
        

# GUI(그래픽 유저 인터페이스)

### SWING

- 보다 세련된 형태의 GUI를 제공하기 위해 만들어진 UI클래스들의 모음

## JFram 클래스

- 생성자
    - `JFrame()` : 보이지 않는 JFram을 생성
    - `JFrame(String title)` : 제목을 가지는 보이지 않는 JFram을 생성

### JFrame의 주요 메서드

- `void add(Component c)` : 만든 요소를 프레임에 붙힌다.
- `setSize(int width, int hieight)` : 프레임의 크기 지정
- `setLocation(int x, int y)` : 프레임이 보여질 좌표 지정
- `setVosivle(boolean value)` : 화면에 표시 여부 결정
- `setDefaultCloseOperation(int operation)` : 사용자가 JFreame을 닫을 때 기본적으로 어떤 작업을 할지 결정
    - `EXIT_ON_CLOSE` : 닫기 단추를 누르면 창을 화면에서 사라지게 하고, 메모리에서도 제거
    - `DO_NOTHING_ON_CLOSE` : 닫기 단추를 비활성화

### 만드는 법

- 상속받기
    
    ```java
    public class JFrameTest extends JFrame{
    	
    	public JFrameTest() {
    		super("제목");
    		//setBounds(x, y, width, height);
    		setBounds(300, 300, 300, 200);
    		setVisible(true);
    	}
    	
    }
    ```
    
    ```java
    public class FrameMain {
    
    	public static void main(String[] args) {
    		JFrameTest f = new JFrameTest();
    
    	}
    
    }
    ```
    
- 메인에 직접 만들기
    
    ```java
    public class FrameMain {
    
    	public static void main(String[] args) { 
    		JFrame f= new JFrame();
    		f.setBounds(300, 300, 300, 200);
    		f.setVisible(true);
    	}
    
    }
    ```
    

### 버튼

```java
JButton jbtn1, jbtn2, jbtn3;

jbtn1 = new JButton("1");
jbtn2 = new JButton("2");
jbtn3 = new JButton("3");

JFrameTest f = new JFrameTest();
// setLayout()
// 프레임안에 요소를 어떻게 배치할 것인가
f.setLayout(new FlowLayout());

f.add(jbtn1);
f.add(jbtn2);
f.add(jbtn3);
```

- 요소의 객체를 먼저 생성해야 화면에 정상적으로 작동한다.

## 이벤트

- 이벤트 : 사용자의 입력, 키보드나 마우스 등의 장치나 소프트웨어적으로 발생하는 모든 사건
- 이벤트 핸들러 : 이벤트가 발생하면 발생된 이벤트에 반응하여 필요한 것들을 처리
- 이벤트 지향 프로그램 : 자바에서 이벤트 핸들러는 메서드로 구현되며, 이벤트의 동작에 응답하는 방식으로 처리되는 프로그램
- 이벤트 지향 프로그램은 무한 루프를 돌면서 사용자의 이벤트가 발생하기를 기다린다. 사용자의 이벤트가 발생하면 이벤트를 처리하고 다시 무한루프로 대기한다.

### 리스너인터페이스를 이용한 이벤트 처리

- 리스너 인터페이스는 이벤트와 이벤트 핸들러 사이를 연결해주는 역할
- 이벤트가 발생한 해당 컴포넌트를 리스너에 등록시켜야 프로그램의 제어가 해당 이벤트가 제공하는 이벤트 핸들러로 옮겨진다.

```java
이벤트 클래스       리스너 인터페이스         메서드(이벤트핸들러)
ActionEvent        ActionListener          actionPerformed(ActionEvent e)
ChangeEvent        ChangeListener          stateChanged(ChangeEvent e)
ItemEvent          ItemListener            itemStateChanged(ItemEvent e)
KeyEvent           KeyListener             KeyPressed(KeyEvent e)
										    						       KeyReleased(KeyEvent e)
																		       KeyTyped(KeyEvent e)
ListSelectionEvent ListSelectionListener   valueChanged(ListSelectionEvent)
MouseEvent         MoustListener           mouseClicked(MouseEvent e)
																					 mouseEntered(MouseEvent e)
																					 mouseExited(mouseEvent e)
																					 mousePressed(mouseEvent e)
																					 mouseReleased(mouseEvent e)
									MouseMotionListener      mouseDragged(MouseEvent e)
																					 mouseMoved(MouseEvent e)
WindowEve         WindowListener           windowActivated(WindowEvent e)
																					 windowClosed(WindowEvent e)
																					 windowClosing(WindowEvent e)
																					 windowDeactivated(WindowEvent e)
```

## JPanel 클래스

- Frame에 붙히는 중간 컨테이너 열할
- 화면이 복잡한 경우 요소를 그룹별로 묶어서 표현할 수 있다.
- `JPanel()` : 레이아웃이 FlowLayout인 JPanel을 생성
- `Jpanel(LayoutManager layout)` : 레이아웃 매니저가 layout인 JPanel을 생성

### 배치관리자

- `FlowLayout` : 왼쪽에서 오른쪽으로 배치, 오른쪽에 공간이 없으면 아래로 배치
- `BorderLayout` : 동, 서, 남, 북, 중앙 5개의 영역으로 나눈다
- `GirdLayout` : 2차원 표 모양으로서 n X n으로 설정해 주며 왼쪽에서 오른쪽으로, 위에서 아래로 배치
- `CardLayout` : 컴포는트를 쪼개서 배치
- `Null` : 레이아웃을 사용하지 않고 수동으로 배치

### JPanel의 메서드

- `add()` : 컴포넌트를 패널에 추가
- `remove()` : 컴포넌트를 패널에서 제거
- `setBounds()` : 패널의 좌표와 크기를 설정
- `setLayout()` : 패널의 배치관리자를 설