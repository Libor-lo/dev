package com.dev.demo;


import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;



import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;


@SpringBootTest
class DemoApplicationTests {

//    @Spy
//    Chess chess;
//
//    @Mock
//    ChessMapper chessMapper;
//
//    @InjectMocks
//    ChessService chessService;
//
//    @BeforeAll
//    static void beforeClass() {
//        System.out.println("=====beforeClass======");
//    }
//
//    @BeforeEach
//    void beforeMethod() {
//        System.out.println("=====beforeMethod======");
//        chess.setId(1);
//        chess.setName("拉克丝");
//        when(chess.getId()).thenReturn(2);
//        doReturn("艾希").when(chess).getName();
//        when(chessMapper.updateById(isA(Chess.class))).thenReturn(0);
//
//    }
//
//    @Test
//    void test01() {
//        System.out.println("=====test01======");
//        Chess chess = chessService.updateById(new Chess());
//        verify(chessMapper).updateById(isA(Chess.class));
//        assertNotNull("error",chess);
//    }
//
//
//
//    @Test
//    void test02() {
//        System.out.println("=====test02======");
//        assertEquals("iderror",2,chess.getId());
//        assertEquals("nameerror","艾希",chess.getName());
//    }
//
//    @AfterEach
//    void afterMethod() {
//        System.out.println("=====afterMethod======");
//    }
//
//    @AfterAll
//    static void afterClass() {
//        System.out.println("=====afterClass======");
//    }

}

//        Mockito简单运用说明
//        1.when(mock.someMethod()).thenReturn(value):设定mock对象某个方法调用时的返回值。可以连续设定返回值，即when(mock.someMethod()).thenReturn(value1).then
//        Return(value2),第一次调用时返回value1,第二次返回value2。也可以表示为如下：
//        when(mock.someMethod()).thenReturn(value1，value2)。
//        2.调用以上方法时抛出异常: when(mock.someMethod()).thenThrow(new Runtime
//        Exception());
//        3.另一种stubbing语法：
//        doReturn(value).when(mock.someMethod())
//        doThrow(new RuntimeException()).when(mock.someMethod())
//        4.对void方法进行方法预期设定只能用如下语法：
//        doNothing().when(mock.someMethod())
//        doThrow(new RuntimeException()).when(mock.someMethod())
//        doNothing().doThrow(new RuntimeException()).when(mock.someMethod())
//        5.方法的参数可以使用参数模拟器，可以将anyInt()传入任何参数为int的方法，即anyInt匹配任何int类型的参数，anyString()匹配任何字符串，anySet()匹配任何Set。
//        6.Mock对象只能调用stubbed方法，调用不了它真实的方法，但是Mockito可以用spy来监控一个真实对象，这样既可以stubbing这个对象的方法让它返回我们的期望值，又可以使得对其他方法调用时将会调用它的真实方法。
//        7.Mockito会自动记录自己的交互行为，可以用verify(…).methodXxx(…)语法来验证方法Xxx是否按照预期进行了调用。
//        (1)    验证调用次数：verify(mock,times(n)).someMethod(argument),n为被调用的次数，如果超过或少于n都算失败。除了times(n)，还有never(),atLease(n),atMost(n)。
//        (2)    验证超时：verify(mock, timeout(100)).someMethod();
//        (3)    同时验证：verify(mock, timeout(100).times(1)).someMethod();