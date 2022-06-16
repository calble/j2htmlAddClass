package j2html.tags.specialized;

import j2html.tags.ContainerTag;
import j2html.tags.attributes.*;

public class OptionTag extends ContainerTag<OptionTag> 
implements IDisabled<OptionTag>,ILabel<OptionTag>,ISelected<OptionTag>,IValue<OptionTag> {
public OptionTag() {super("option");}
}
