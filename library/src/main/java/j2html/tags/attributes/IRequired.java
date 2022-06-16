package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IRequired<T extends Tag<T>> extends IInstance<T>  {
default T isRequired() {self().attr("required");
return self();
}
default T withCondRequired(final boolean enable) {if (enable){
self().attr("required");
}
return self();
}
}
