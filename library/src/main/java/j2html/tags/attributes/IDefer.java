package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDefer<T extends Tag<T>> extends IInstance<T>  {
default T isDefer() {self().attr("defer");
return self();
}
default T withCondDefer(final boolean enable) {if (enable){
self().attr("defer");
}
return self();
}
}
