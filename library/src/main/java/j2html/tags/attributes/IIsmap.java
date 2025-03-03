package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IIsmap<T extends Tag<T>> extends IInstance<T>  {
default T isIsmap() {self().attr("ismap");
return self();
}
default T withCondIsmap(final boolean enable) {if (enable){
self().attr("ismap");
}
return self();
}
}
