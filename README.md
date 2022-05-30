# j2html with addClass Methods
This is a fork of the j2html library. In j2html the withClass and withClasses methods
replace the existing class value of the tag.  This fork adds the following methods:

* addClass
* addClasses
* condAddClass

This provides the functionality to add class names to tags without changing how the
withClass, withClasses, and condWithClass methods work.

## Using the Library
To use this library download the Jar file in the release section.


## Import TagCreator and start building HTML
```java
import static j2html.TagCreator.*;

public class Main {
    public static void main(String[] args) {
        body(
            h1("Hello, World!"),
            img().withSrc("/img/hello.png")
                .addClass("c1")
                .addClass("c2")
        ).render();
    }
}
```
The above Java will result in the following HTML:
```html
<body>
    <h1>Hello, World!</h1>
    <img src="/img/hello.png" class="c1 c2">
</body>
```

