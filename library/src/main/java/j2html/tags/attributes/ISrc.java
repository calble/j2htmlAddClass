package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISrc<T extends Tag<T>> extends IInstance<T>  {
default T withSrc(final String src_) {return self().attr("src", src_);
}
default T withCondSrc(final boolean enable, final String src_) {if (enable){
self().attr("src", src_);
}
return self();
}
}
