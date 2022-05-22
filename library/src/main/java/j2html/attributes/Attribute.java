package j2html.attributes;

import j2html.Config;
import j2html.rendering.TagBuilder;
import j2html.tags.Renderable;

import java.io.IOException;
import java.util.Objects;

public class Attribute implements Renderable {
    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Attribute(String name) {
        this.name = name;
        this.value = null;
    }

    @Override
    @Deprecated
    public void renderModel(Appendable writer, Object model) throws IOException {
        if (writer instanceof TagBuilder) {
            if (name != null) {
                if (value != null) {
                    ((TagBuilder) writer).appendAttribute(name, value);
                } else {
                    ((TagBuilder) writer).appendBooleanAttribute(name);
                }
            }
        } else {
            if (name == null) {
                return;
            }
            writer.append(' ');
            writer.append(name);
            if (value != null) {
                writer.append("=\"");
                writer.append(Config.textEscaper.escape(value));
                writer.append('"');
            }
        }
    }

    public void render(TagBuilder builder, Object model) throws IOException {
        // Maintain compatibility with classes that extend Attribute, for now...
        renderModel(builder, model);
    }

    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        Attribute attribute = (Attribute) o;
        return Objects.equals(name, attribute.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
