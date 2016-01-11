package de.codeshelf.consoleui.elements.items.impl;

import de.codeshelf.consoleui.elements.PromptableElementIF;
import de.codeshelf.consoleui.elements.items.ConsoleUIItemIF;

/**
 * User: andy
 * Date: 07.01.16
 */
public class ChoiceItem implements PromptableElementIF, ConsoleUIItemIF {
  private Character key;
  private String name;
  private String message;

  public ChoiceItem(Character key, String name, String message) {
    this.key = key;
    this.name = name;
    this.message = message;
  }

  public Character getKey() {
    return key;
  }

  public String getName() {
    return name;
  }

  public String getMessage() {
    return message;
  }

  public boolean isSelectable() {
    return true;
  }
}