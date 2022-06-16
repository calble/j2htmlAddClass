package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IHigh<T extends Tag<T>> extends IInstance<T>  {
default T withHigh(final String high_) {return self().attr("high", high_);
}
default T withCondHigh(final boolean enable, final String high_) {if (enable){
self().attr("high", high_);
}
return self();
}
}
