package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISrclang<T extends Tag<T>> extends IInstance<T>  {
default T withSrclang(final String srclang_) {return self().attr("srclang", srclang_);
}
default T withCondSrclang(final boolean enable, final String srclang_) {if (enable){
self().attr("srclang", srclang_);
}
return self();
}
}
