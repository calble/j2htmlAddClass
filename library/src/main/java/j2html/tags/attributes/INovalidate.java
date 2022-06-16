package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface INovalidate<T extends Tag<T>> extends IInstance<T>  {
default T isNovalidate() {self().attr("novalidate");
return self();
}
default T withCondNovalidate(final boolean enable) {if (enable){
self().attr("novalidate");
}
return self();
}
}
