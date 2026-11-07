import { TestBed, async } from '@angular/core/testing';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { TokenStorageService } from './_services/token-storage.service';

describe('AppComponent', () => {
  beforeEach(async(() => {
    window.sessionStorage.clear();
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
      schemas: [NO_ERRORS_SCHEMA]
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('should not be logged in without a token', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    expect(fixture.componentInstance.isLoggedIn).toBeFalse();
  });

  it('should show the display name when a token is stored', () => {
    const storage = TestBed.inject(TokenStorageService);
    storage.saveToken('dummy-token');
    storage.saveUser({ displayName: 'Hendi', roles: ['ROLE_USER'] });

    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const app = fixture.componentInstance;

    expect(app.isLoggedIn).toBeTrue();
    expect(app.username).toEqual('Hendi');
    expect(app.showAdminBoard).toBeFalse();
  });
});
