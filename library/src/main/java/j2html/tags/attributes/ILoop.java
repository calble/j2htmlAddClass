package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ILoop<T extends Tag<T>> extends IInstance<T>  {
default T isLoop() {self().attr("loop");
return self();
}
default T withCondLoop(final boolean enable) {if (enable){
self().attr("loop");
}
return self();
}
}
