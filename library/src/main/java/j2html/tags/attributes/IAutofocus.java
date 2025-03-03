package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAutofocus<T extends Tag<T>> extends IInstance<T>  {
default T isAutofocus() {self().attr("autofocus");
return self();
}
default T withCondAutofocus(final boolean enable) {if (enable){
self().attr("autofocus");
}
return self();
}
}
