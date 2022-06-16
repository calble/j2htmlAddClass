package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOpen<T extends Tag<T>> extends IInstance<T>  {
default T isOpen() {self().attr("open");
return self();
}
default T withCondOpen(final boolean enable) {if (enable){
self().attr("open");
}
return self();
}
}
