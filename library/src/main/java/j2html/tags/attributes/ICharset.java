package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ICharset<T extends Tag<T>> extends IInstance<T>  {
default T withCharset(final String charset_) {return self().attr("charset", charset_);
}
default T withCondCharset(final boolean enable, final String charset_) {if (enable){
self().attr("charset", charset_);
}
return self();
}
}
