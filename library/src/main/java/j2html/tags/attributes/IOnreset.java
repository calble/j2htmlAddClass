package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnreset<T extends Tag<T>> extends IInstance<T>  {
default T withOnreset(final String onreset_) {return self().attr("onreset", onreset_);
}
default T withCondOnreset(final boolean enable, final String onreset_) {if (enable){
self().attr("onreset", onreset_);
}
return self();
}
}
