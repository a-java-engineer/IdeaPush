package decorator2;

// 组件接口
interface Window {
    void draw();
}

// 具体组件
class SimpleWindow implements Window {
    public void draw() {
        System.out.println("绘制简单窗口");
    }
}

// 装饰器
abstract class WindowDecorator implements Window {
    protected Window decoratedWindow;

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    public void draw() {
        decoratedWindow.draw();
    }
}

// 具体装饰器 - 滚动条
class ScrollbarDecorator extends WindowDecorator {
    public ScrollbarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        super.draw();
        drawScrollbar();
    }

    private void drawScrollbar() {
        System.out.println("添加滚动条");
    }
}

// 具体装饰器 - 边框
class BorderDecorator extends WindowDecorator {
    public BorderDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("添加边框");
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Window window = new SimpleWindow();

// 添加第一个滚动条
        Window decoratedWindowWithScrollbar1 = new ScrollbarDecorator(window);

// 添加第二个滚动条
        Window decoratedWindowWithScrollbar2 = new ScrollbarDecorator(decoratedWindowWithScrollbar1);

// 添加第三个滚动条
        Window decoratedWindowWithScrollbar3 = new ScrollbarDecorator(decoratedWindowWithScrollbar2);

// 添加第四个滚动条
        Window decoratedWindowWithScrollbar4 = new ScrollbarDecorator(decoratedWindowWithScrollbar3);

// 绘制带有四个滚动条的窗口
        decoratedWindowWithScrollbar4.draw();



    }
}
